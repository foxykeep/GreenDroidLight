/**
 * <pre>
 * 2012 Foxykeep (http://www.foxykeep.com)
 * 
 * Based on the project GreenDroid by Cyril Mottier (http://www.cyrilmottier.com)
 * 
 * Original License :
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * </pre>
 */

package com.foxykeep.greendroidlight.poc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.foxykeep.greendroidlight.poc.R;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bindViews();
    }

    private void bindViews() {
        ((Button) findViewById(R.id.b_async_image_view)).setOnClickListener(this);
        ((Button) findViewById(R.id.b_paged_view)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_async_image_view:
                startActivity(new Intent(this, AsyncImageViewListActivity.class));
                break;
            case R.id.b_paged_view:
                startActivity(new Intent(this, PagedViewActivity.class));
                break;
        }
    }
}
