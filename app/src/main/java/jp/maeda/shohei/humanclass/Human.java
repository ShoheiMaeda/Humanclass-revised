package jp.maeda.shohei.humanclass;

import android.util.Log;


    public class Human extends Animal implements Thinkable{

        String hobby;


        //コンストラクタ
        public Human(String name, int age,String hobby) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

        //メンバ関数
        public void say() {
            Log.d("javatest", "私の名前は"+this.name+"です。年は" +this.age+ "歳です。");
        }

        @Override
        public void think(){
            Log.d("javatest","私は" + hobby + "について考える。");
        }
    }

