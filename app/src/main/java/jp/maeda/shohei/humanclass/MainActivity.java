package jp.maeda.shohei.humanclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human maeda = new Human("maeda",22,"soccer");
        maeda.say();
        Human ushiroda = new Human("ushiroda",22,"baseball");
        ushiroda.say();
        maeda.think();
        ushiroda.think();
    }

}
