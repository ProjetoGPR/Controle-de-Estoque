package br.ufg.inf.inventorycontrolActivity;

import com.example.inventorycontrol.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CadastroActivity extends Activity {
	Spinner unidadeDeMedida;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		unidadeDeMedida = (Spinner) findViewById(R.id.spUnidadeDeMeida);
		ArrayAdapter<CharSequence> ar = ArrayAdapter.createFromResource(this, R.array.UnidadedeMedida, android.R.layout.simple_list_item_1);
		ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		unidadeDeMedida.setAdapter(ar);

	}
	
	public void incluir (View view){
		/*
		 * Implementar o metodo que criar o objeto produto
		 * e armazena na lista.
		 */
		AlertDialog ad = new AlertDialog.Builder(this).create();
		ad.setTitle("teste");
		ad.setMessage("teste");
		ad.show();
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
