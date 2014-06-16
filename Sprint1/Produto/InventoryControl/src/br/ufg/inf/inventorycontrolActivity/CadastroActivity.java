package br.ufg.inf.inventorycontrolActivity;

import java.util.ArrayList;
import java.util.List;

import br.ufg.inf.inventorycontrolModel.*;

import com.example.inventorycontrol.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class CadastroActivity extends Activity {
	private Spinner unidadeDeMedida;
	private ArrayAdapter<UnidadeDeMedida> mAdapater;
	private List <UnidadeDeMedida> mItens;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		mItens=new ArrayList<UnidadeDeMedida>();
		populandoListaDeUnidadeDeMedidas();
		mAdapater = new ArrayAdapter<UnidadeDeMedida>(this, R.layout.activity_spinner, mItens);
		unidadeDeMedida= (Spinner) findViewById(R.id.spUnidadeDeMeida);
		mAdapater.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		unidadeDeMedida.setAdapter(mAdapater);
	}
	
	public void populandoListaDeUnidadeDeMedidas(){
		UnidadeDeMedida kg = new UnidadeDeMedida(1, "KG");
		mItens.add(kg);
		UnidadeDeMedida g = new UnidadeDeMedida(2, "g");
		mItens.add(g);
		UnidadeDeMedida l = new UnidadeDeMedida(3, "L");
		mItens.add(l);
		UnidadeDeMedida ml = new UnidadeDeMedida(4, "mL");
		mItens.add(ml);
		UnidadeDeMedida va = new UnidadeDeMedida(5, "Valor Absoluto");
		mItens.add(va);
		
	}
	
	public void incluir (View view){
		EditText nomeEt=(EditText) findViewById(R.id.etNome);
		EditText fabricanteEt=(EditText) findViewById(R.id.etFabricante);
		EditText quantidadeEt= (EditText) findViewById(R.id.etQuantidade);
		
		String nome=nomeEt.getText().toString();
		String fabricante=fabricanteEt.getText().toString();
		String unidadeDeMedidaIncluir=unidadeDeMedida.getSelectedItem().toString();
		String quantidade=quantidadeEt.getText().toString();
		
		Produto novoproduto;
		novoproduto=new Produto(nome, fabricante, unidadeDeMedidaIncluir,Integer.parseInt(quantidade));
		
		AlertDialog ad = new AlertDialog.Builder(this).create();
		ad.setTitle("Cadastro de Produto");
		ad.setMessage("Produto "+novoproduto.getNome()+" incluido com sucesso");
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
