package taichi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ポチ", 3, "テニス");     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.think();
    }
}
