/*Copyright ©2015 TommyLemon(https://github.com/TommyLemon)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package zuo.biao.pagedlistview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**GridView示例
 * @author Lemon
 */
public class GridViewActivity extends Activity {

	private GridView gvGridView;
	private List<String> list;
	private PageScoller pageScoller;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view_activity);
		
		gvGridView = (GridView) findViewById(R.id.gvGridView);

		list = new ArrayList<String>();
		for (int i = 0; i < 200; i++) {
			list.add("Item" + i);
		}
		
		gvGridView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
		
		pageScoller = new PageScoller(gvGridView);
		pageScoller.init();
	}
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		pageScoller.dispatchTouchEvent(ev);
		return super.dispatchTouchEvent(ev);
	}

}
