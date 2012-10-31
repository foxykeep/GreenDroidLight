/*
 * Copyright (C) 2011 Cyril Mottier (http://www.cyrilmottier.com) Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package com.foxykeep.greendroidlight.poc.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.foxykeep.greendroidlight.poc.R;
import com.foxykeep.greendroidlight.widget.PagedAdapter;
import com.foxykeep.greendroidlight.widget.PagedView;
import com.foxykeep.greendroidlight.widget.PagedView.OnPagedViewChangeListener;

public class PagedViewActivity extends Activity {

    private static final int PAGE_COUNT = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paged_view);

        final PagedView pagedView = (PagedView) findViewById(R.id.paged_view);
        pagedView.setOnPageChangeListener(mOnPagedViewChangedListener);
        pagedView.setAdapter(new PhotoSwipeAdapter());

    }

    private OnPagedViewChangeListener mOnPagedViewChangedListener = new OnPagedViewChangeListener() {

        @Override
        public void onStopTracking(PagedView pagedView) {
        }

        @Override
        public void onStartTracking(PagedView pagedView) {
        }

        @Override
        public void onPageChanged(PagedView pagedView, int previousPage, int newPage) {
            Toast.makeText(PagedViewActivity.this, "And here is page " + newPage,
                    Toast.LENGTH_SHORT).show();
        }
    };

    private class PhotoSwipeAdapter extends PagedAdapter {

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.paged_view_item, parent, false);
            }

            ((TextView) convertView).setText(Integer.toString(position));

            return convertView;
        }

    }
}
