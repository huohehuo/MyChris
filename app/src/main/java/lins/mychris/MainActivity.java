package lins.mychris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private MyTreeView myTreeView;
    private TreeTop treeTop;
    private LinearLayout linearLayout;
    private int num;
    private int num2=1;
    LayoutInflater layoutInflater;
    private String how;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.trees);
        layoutInflater = LayoutInflater.from(this);

        Intent intent = getIntent();
        how= intent.getStringExtra("how");
        num = Integer.valueOf(how);

        treeTop = new TreeTop(this);
        LinearLayout.LayoutParams lp2=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,100);
        linearLayout.addView(treeTop,lp2);
       do{
           View view = layoutInflater.inflate(R.layout.treeview,null);
           //myTreeView = new MyTreeView(this);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,num2*30);
             //myTreeView.setLayoutParams(lp);
            lp.gravity = Gravity.CENTER_HORIZONTAL;
            lp.setMargins(0,0,0,0);
            linearLayout.addView(view,lp);
            Log.d("aaaaa","绘制了："+num);
           num2++;
        } while (num2<num);

    }
}
