package taichi.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable {

    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。歳は" + this.age + "歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatest", "「私は" + this.hobby + "について考える。」");
    }
}
