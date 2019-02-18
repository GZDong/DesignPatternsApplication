package com.gzd.example.designpatternsapplication.builder.trainning;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class WebConfig {
    String a1;   //非私有
    String a2;
    String a3;

    public static class Builder{   //懒加载
        String a1;   //非私有
        String a2;
        String a3;
        public Builder setA1(String a1){   //非静态，也就意味着builder需要构建一个对象
            this.a1 = a1;
            return this;
        }

        public Builder setA2(String a2){
            this.a2 = a2;
            return this;
        }

        public Builder setA3(String a3){
            this.a3 = a3;
            return this;
        }

        void applyConfig(WebConfig config){
            config.a1 = this.a1;
            config.a2 = this.a2;
            config.a3 = this.a3;
        }

        public WebConfig create(){
            WebConfig webConfig = new WebConfig();
            applyConfig(webConfig);
            return webConfig;
        }
    }
}
