package com.websarva.wings.android.intentsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        // 画面部品ListViewを取得。
        ListView lvMenu = findViewById(R.id.lvMenu);
        // SimpleAdapterで使用するListオブジェクトを用意。
        List<Map<String, String>> menuList = new ArrayList<>();
        // 「から揚げ定食」のデータを格納するMapオブジェクトの用意とmenuListへのデータ登録。
        Map<String,String> menu = new HashMap<>();
        menu.put("name", "から揚げ定食");
        menu.put("price", "800円");
        menuList.add(menu);
        // 「ハンバーグ定食」のデータを格納するMapオブジェクトの用意とmenuListへのデータ登録。
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "850円");
        menuList.add(menu);
        // 「生姜焼き定食」
        menu = new HashMap<>();
        menu.put("name", "生姜焼き定食");
        menu.put("price", "850円");
        menuList.add(menu);
        // 「ステーキ定食」
        menu = new HashMap<>();
        menu.put("name", "ステーキ定食");
        menu.put("price", "1000円");
        menuList.add(menu);
        // 「野菜炒め定食」
        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", "750円");
        menuList.add(menu);
        // 「とんかつ定食」
        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        // 「ミンチかつ定食」
        menu = new HashMap<>();
        menu.put("name", "ミンチかつ定食");
        menu.put("price", "850円");
        menuList.add(menu);
        // 「チキンカツ定食」
        menu = new HashMap<>();
        menu.put("name", "チキンカツ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        // 「コロッケ定食」
        menu = new HashMap<>();
        menu.put("name", "コロッケ定食");
        menu.put("price", "850円");
        menuList.add(menu);
        // 「焼き魚定食」
        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", "1050円");
        menuList.add(menu);

        // SimpleAdapter第4引数from用データの用意。
        String[] from = {"name", "price"};
        int[] to = {android.R.id.text1, android.R.id.text2};
        // SimpleAdapterを生成。
        SimpleAdapter adapter = new SimpleAdapter(MenuListActivity.this, menuList,
                android.R.layout.simple_list_item_2, from, to);
        // アダプタの登録。
        lvMenu.setAdapter(adapter);

    }
}
