/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.huawei.mlkit.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.huawei.mlkit.example.body.BodyActivity;
import com.huawei.mlkit.example.body.skeleton.LiveSkeletonAnalyseActivity;



import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {
    // Your ApiKey, please see：https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/sdk-data-security-0000001050040129.
    public static final String apiKey = "your ApiKey";
    // Your access token, please see: https://developer.huawei.com/consumer/en/doc/HMSCore-Guides/open-platform-oauth-0000001050123437-V5.
    public static final String accessToken = "your access token";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_choose);

        Intent intent = new Intent(ChooseActivity.this,  LiveSkeletonAnalyseActivity.class);
        startActivity(intent);
        this.findViewById(R.id.btn_body).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_body:
                this.startActivity(new Intent(ChooseActivity.this,  LiveSkeletonAnalyseActivity.class));
                break;
            default:
                break;
        }
    }
}
