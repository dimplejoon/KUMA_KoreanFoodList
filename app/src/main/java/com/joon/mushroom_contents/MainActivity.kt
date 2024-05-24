package com.joon.mushroom_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //RecyclerView Data ModelのList
    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.google.com/maps/place/%E3%83%A4%E3%83%B3%E3%83%94%E3%83%A7%E3%83%B3+%E3%83%98%E3%82%B8%E3%83%A3%E3%83%B3%E3%82%AF/@35.7009486,139.7014977,17z/data=!3m1!5s0x60188d26d78e41b9:0x34ee5a2dd7c92e00!4m10!1m2!2m1!1z44Ok44Oz44OU44On44Oz44OY44K444Oj44Oz44Kv!3m6!1s0x60188d047e44859d:0xd1a8146191f02018!8m2!3d35.7009486!4d139.7060038!15sCh7jg6Tjg7Pjg5Tjg6fjg7Pjg5jjgrjjg6Pjg7Pjgq9aIiIg44Ok44Oz44OU44On44OzIOODmCDjgrjjg6Pjg7Pjgq-SARFrb3JlYW5fcmVzdGF1cmFudOABAA!16s%2Fg%2F11rqspjvl2?entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipPTpSJyHS1Q3dbBKPf1_LxplVWyKJbbBZLRo-yT=w529-h298-k-no",
                "ヤンピョン ヘジャンク"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E3%82%AC%E3%83%A4%E3%83%81%E3%82%AD%E3%83%B3/@35.7007957,139.6890601,15z/data=!3m1!5s0x60192a858eb18f17:0x6c1f997e7c4a0ccc!4m10!1m2!2m1!1z7Iug7Jik7L-g67O0IOy5mO2CqA!3m6!1s0x60188d20d06cb77d:0xdcabb6eb2cb9f1e6!8m2!3d35.7007957!4d139.7070845!15sChPsi6DsmKTsv6Drs7Qg7LmY7YKoWhUiE-yLoOyYpOy_oOuztCDsuZjtgqiSARFrb3JlYW5fcmVzdGF1cmFudJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSQ04yRlFUVUpSRUFF4AEA!16s%2Fg%2F1tdq13rd?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipNHL1Pe91rbkEZGG9ZpG2ble56YX6K_27nByftF=w397-h298-k-no",
                "ガヤチキン"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E8%BE%9B%E3%81%A1%E3%82%83%E3%82%93+%E6%96%B0%E5%A4%A7%E4%B9%85%E4%BF%9D%E6%9C%AC%E5%BA%97/@35.6995584,139.683705,15z/data=!4m10!1m2!2m1!1z7Iug7Jik7L-g67O0IOy5mO2CqA!3m6!1s0x60188cd8a83ff085:0x157c6f60006f9729!8m2!3d35.6995584!4d139.7017294!15sChPsi6DsmKTsv6Drs7Qg7LmY7YKoWhUiE-yLoOyYpOy_oOuztCDsuZjtgqiSARtqYXBhbmVzZV9pemFrYXlhX3Jlc3RhdXJhbnSaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUXRNR1JsUzNGQlJSQULgAQA!16s%2Fg%2F1tjynqfn?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipOkwdO0R4iSwAAvdu8WZh61GgCDKoY9HY7Z93eB=w397-h298-k-no",
                "辛ちゃん　新大久保店"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E3%83%81%E3%83%A3%E3%82%AB%E3%83%B3%E9%A3%9F%E5%A0%82/@35.6992469,139.7014025,17z/data=!4m17!1m10!3m9!1s0x60188db50210c187:0x2a4a3c17f5239714!2z44OB44Oj44Kr44Oz6aOf5aCC!8m2!3d35.6992002!4d139.7015159!10e5!14m1!1BCgIgARICGAI!16s%2Fg%2F11h84y04ym!3m5!1s0x60188db50210c187:0x2a4a3c17f5239714!8m2!3d35.6992002!4d139.7015159!16s%2Fg%2F11h84y04ym?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipOJNcYj8uUJUowf_MQto24OstZfPqQznzL03CaM=w397-h298-k-no",
                "チャカン食堂"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E3%83%8F%E3%83%B3%E3%83%A4%E3%83%B3%E3%82%AF%E3%83%83%E3%83%91%E3%83%A4/@35.6991525,139.7013216,17z/data=!3m1!5s0x60188d26f1522b9f:0x2dacd9eae75dec40!4m10!1m2!2m1!1z7ZWc7JaR6rWt67Cl!3m6!1s0x60188daaecabe453:0xf72f7aa25dd6db15!8m2!3d35.7010131!4d139.7055689!15sCgztlZzslpHqta3rsKVaDyIN7ZWc7JaRIOq1reuwpZIBEWtvcmVhbl9yZXN0YXVyYW50mgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVVE1TVUxeFYwMW5FQUXgAQA!16s%2Fg%2F11rycr2c94?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipPgD9yWfxmF0K7IrptydRX5uXsmLI2O_d2SHG_u=w431-h298-k-no",
                "ハンヤンクッパ"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%EB%8B%88%EC%BF%A0+%EC%97%94+%EB%A9%98/@35.6991438,139.7013216,17z/data=!3m1!4b1!4m6!3m5!1s0x60188d27a731d0c5:0x7802a1e8daaaef08!8m2!3d35.6991395!4d139.7038965!16s%2Fg%2F11ckvf6g38?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipOhA4PKcojNV1b81fMSFTyPok-8Brg_KHxn8ouU=w359-h298-k-no",
                "肉＆麺"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E3%83%81%E3%82%BE%E3%83%83%E3%82%AF%E3%83%9C/@35.6943144,139.8172874,17z/data=!3m2!4b1!5s0x601888d900a1151d:0xfb3d1b3579f10840!4m6!3m5!1s0x6018895f9997f509:0xaaeadfb1417c343d!8m2!3d35.6943144!4d139.8172874!16s%2Fg%2F11h4dg37dn?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipPi2LitmS_tvMhP4D8wHQHkOASZr9zOtV0eiIPs=w397-h298-k-no",
                "チゾックボ　錦糸町"
            )
        )
        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/Meido+Samugyopusaru+Korean+Restaurant/@35.7250543,139.815229,17z/data=!3m1!5s0x6018895f05d30cbd:0x8c0996ddf9e0e30e!4m10!1m2!2m1!1z5p2x5ZCR5bO244CA6Z-T5Zu95paZ55CG!3m6!1s0x60188ffcf00bfd71:0xe8a05a06c0a76a51!8m2!3d35.7250543!4d139.8197351!15sChjmnbHlkJHls7bjgIDpn5Plm73mlpnnkIZaGiIY5p2xIOWQkeWztiDpn5Plm70g5paZ55CGkgERa29yZWFuX3Jlc3RhdXJhbnSaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVTlhjWEJsUnpoblJSQULgAQA!16s%2Fg%2F11snt2s5vs?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipMNBWZxlQGJCSUGoUK8Qkzj3L88t-y40bTJfVBD=w224-h398-k-no",
                "韓国家庭料理 明洞"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E9%A7%85%E5%89%8D%E9%85%92%E5%A0%B4/@35.7015797,139.6980539,17z/data=!3m2!4b1!5s0x60188d2f4ff342d3:0x733a6e934bba73aa!4m6!3m5!1s0x60188d3e64a1e19d:0x61211449a99eecf1!8m2!3d35.7015754!4d139.7006288!16s%2Fg%2F11sqd0sy1h?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipMeQtP5utk_h_T_SaFuZ4kjhTYSm4NZn0UrbwEI=w224-h335-k-no",
                "駅前酒場"
            )
        )
        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%EC%86%A1%EA%B0%80/@35.6987423,139.70011,17z/data=!3m2!4b1!5s0x60188d27b88a623d:0xc8f07dc0f5b29340!4m6!3m5!1s0x60188dd376cf1943:0xc1e40f9a80fec27!8m2!3d35.698738!4d139.7026849!16s%2Fg%2F11q41gq5mk?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipOHJPjR8viYjGu5hZzcDVmSS0pXCW8p02Dkk2CK=w298-h298-k-no",
                "宋家ガムジャタン"
            )
        )

        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%E3%83%81%E3%82%BE%E3%83%83%E3%82%AF%E3%83%9C/@35.6943144,139.8172874,17z/data=!3m2!4b1!5s0x601888d900a1151d:0xfb3d1b3579f10840!4m6!3m5!1s0x6018895f9997f509:0xaaeadfb1417c343d!8m2!3d35.6943144!4d139.8172874!16s%2Fg%2F11h4dg37dn?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipMM1JYCCV8r8Xe9-Q3RQjdZhKIyTWcoCfRdPGoG=w397-h298-k-no",
                "香港飯店0410"
            )
        )
        items.add(
            ContentsModel(
                "https://www.google.co.kr/maps/place/%ED%95%B4%EC%9A%B4%EB%8C%80+%EB%B3%B8%EC%A0%90/@35.6978013,139.6986639,17z/data=!3m1!5s0x60188d277f9bf6fb:0xbc82e297a5f4c1d0!4m10!1m2!2m1!1z7Iug7Jik7L-g67O0IO2an-ynkQ!3m6!1s0x60188d27922c21ab:0xbf8b44f1b465a56d!8m2!3d35.6978013!4d139.70317!15sChPsi6DsmKTsv6Drs7Qg7Zqf7KeRWhUiE-yLoOyYpOy_oOuztCDtmp_sp5GSARFrb3JlYW5fcmVzdGF1cmFudJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VOMWNHSjVkRTUzRUFF4AEA!16s%2Fg%2F11bbxpsqxv?hl=ko&entry=ttu",
                "https://lh5.googleusercontent.com/p/AF1QipMnqFA9wSVndN33d1w97nDPRVIJkLPdd5u0U96U=w397-h298-k-no",
                "海雲台 本店"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                startActivity(intent)

            }
        }

        /**
         *  Study Memo
         *      1) LayoutManager가 getViewForPosition으로 view를 요청
         *      2) RecyclcerView는 캐시에 getViewForPosition으로 확인. 있으면 LayoutManager에게 반환
         *      3) 캐시에 없으면 adapter에게 type이 뭔지 물어보고 Recycled Pool에 getViewHolderByType으로 요청
         *      4) Pool에 있으면 반환, 없으면 adapter에게 createViewHolder로 아이템 생성.
         *      5) 뷰를 찾으면 adapter에서 bindview를 하고 LayoutManager에게 리턴.
         *      6) LayoutManager는 RecyclerView에게 addView를 수행하고 adapter의 onViewAttachedToWindow가 호출됨.
         *         캐시와 Recycled Pool은 RecyclerView안에 이미 선언되어있음.
         *         setItemViewCacheSize함수로 캐시 사이즈 변경 가능.
         */

        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}