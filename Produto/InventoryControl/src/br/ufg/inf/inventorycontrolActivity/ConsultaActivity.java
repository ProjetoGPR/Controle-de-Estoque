package br.ufg.inf.inventorycontrolActivity;

import br.ufg.inf.inventorycontrolControle.ControleProdutos;

import com.example.inventorycontrol.R;









import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ConsultaActivity extends Activity {
private Intent it;
TextView nomeProdutoSelecionado, fabrincanteProdutoSelecionado, unidadeProdutoSelecionado, quantidadeProdutoSelecionado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consulta);
		
		nomeProdutoSelecionado=(TextView) findViewById(R.id.tvConsultaDetalhadaNomeProdutoSelecionado);
		fabrincanteProdutoSelecionado=(TextView) findViewById(R.id.tvConsultaDetalhadaFabricanteProdutoSelecionado);
		unidadeProdutoSelecionado=(TextView) findViewById(R.id.tvConsultaDetalhadaUnidadeDeMedidaSelecionado);
		quantidadeProdutoSelecionado=(TextView) findViewById(R.id.tvConsultaDetalhadaQuantidadeProdutoSelecionado);
		
		nomeProdutoSelecionado.setText(""+ControleProdutos.produtosCadastrados.get(ListarActivity.posicaoSelecionadoDoArray).getNome());
		fabrincanteProdutoSelecionado.setText(""+ControleProdutos.produtosCadastrados.get(ListarActivity.posicaoSelecionadoDoArray).getFabricante());
		unidadeProdutoSelecionado.setText(""+ControleProdutos.produtosCadastrados.get(ListarActivity.posicaoSelecionadoDoArray).getUnidadeDeMedida());
		quantidadeProdutoSelecionado.setText(""+ControleProdutos.produtosCadastrados.get(ListarActivity.posicaoSelecionadoDoArray).getQuantidade());
		
		ActionBar ab = getActionBar();
		ab.setDisplayHomeAsUpEnabled(true);
	}
	
   @SuppressWarnings("unused")
   private void removerProduto(){
	   
   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consulta, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		int id = item.getItemId();
		if (id == android.R.id.home) {
			it = new Intent();
			it.setClass(this, ListarActivity.class);
			startActivity(it);	
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
