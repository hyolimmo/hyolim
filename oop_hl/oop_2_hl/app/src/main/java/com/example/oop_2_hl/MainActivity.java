package com.example.oop_2_hl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener, FunctionListner {
    private EditText edit;
    private GeneralMember ge = new GeneralMember();
    private FullMember fu = new FullMember();
    private static final String TAG = "MainActivity";
    private Manager ma = new Manager();
    private Button btn_log, btn_write, btn_delete, btn_read, btn_control;
    private TextView final_text;

    private String w = "write";

    @Override
    public void onWrite(String write) {
        w = write;
    }

    private String r = "read";

    @Override
    public void onRead(String read) {
        r = read;
    }

    private String d = "delete";

    @Override
    public void onDelete(String delete) {
        d = delete;
    }

    private String c = "control";

    @Override
    public void onControl(String control) {
        c = control;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewholder();
    }

    private void viewholder() {
        edit = (EditText) findViewById(R.id.edit);
        btn_log = (Button) findViewById(R.id.btn_log);
        btn_write = (Button) findViewById(R.id.btn_write);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_read = (Button) findViewById(R.id.btn_read);
        btn_control = (Button) findViewById(R.id.btn_control);
        final_text = (TextView) findViewById(R.id.final_text);

        btn_log.setOnClickListener(this);
        btn_write.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_read.setOnClickListener(this);
        btn_control.setOnClickListener(this);

        ge.onSetUpListener(this);
        fu.onSetUpListener(this);
        ma.onSetUpListener(this);
    }

    private void Inaccessible() {
        final_text.setText("위 회원은 사용불가");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_log:
                String mlog=edit.getText().toString();
                if (mlog.equals("general")){
                    ge.Function();
                }else if (mlog.equals("full")){
                    fu.Function();
                }else if (mlog.equals("manager")){
                    ma.Function();
                }else {
                    Toast mToast=Toast.makeText(getApplicationContext(),"다시 입력해 주시요",Toast.LENGTH_LONG);
                    mToast.show();
                }break;
            case R.id.btn_write:
                if (w.equals("true")){
                    final_text.setText("글쓰기");
                }else{
                    Inaccessible();
                }
                break;
            case R.id.btn_read:
                if (r.equals("true")) {
                final_text.setText("읽기");
                }else{
                    Inaccessible();
                }
                break;
            case R.id.btn_delete:
                if (d.equals("true")){
                final_text.setText("삭제");
                }else {
                    Inaccessible();
                }
                break;
            case R.id.btn_control:
                if (c.equals("true")) {
                    final_text.setText("관리");
                }else {
                    Inaccessible();
                }
                break;
                default:
                    break;
        }
    }
}