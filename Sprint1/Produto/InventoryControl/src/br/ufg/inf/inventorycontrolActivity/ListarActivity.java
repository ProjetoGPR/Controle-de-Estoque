package br.ufg.inf.inventorycontrolActivity;

import java.util.ArrayList;

import br.ufg.inf.inventorycontrolModel.Produto;

import com.example.inventorycontrol.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListarActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar);
		/*
		 * PEnsar em uma maneira de listar apenas o atributo nome do produto
		 * pois não tem como listar o prosuto em si.
		 */
		ArrayList<Produto> produtosCadastrados=new ArrayList<Produto>();
		ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this,android.R.layout.simple_expandable_list_item_1,produtosCadastrados);
		ListView lv = (ListView) findViewById(R.id.lListView);
		lv.setAdapter(adapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
