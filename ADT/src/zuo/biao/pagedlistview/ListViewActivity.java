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

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**ListView示例
 * @author Lemon
 */
public class ListViewActivity extends Activity {

	private ListView lvListView;
	private List<String> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view_activity);
		
		lvListView = (ListView) findViewById(R.id.lvListView);

		list = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			list.add("Item" + i);
		}
		
		lvListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));

		new PageScroller(lvListView).init();
	}

}
