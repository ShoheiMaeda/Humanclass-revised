package jp.maeda.shohei.humanclass;

public class Human extends Animal {

    //コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" ＋ this.name ＋ "です。年は" ＋　this.age　＋ "歳です。" );
    }
}

