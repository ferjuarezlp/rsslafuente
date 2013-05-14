package com.underapps.rsslafuente;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;

public class Configuracion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configuracion);

		Button iniciar = (Button) findViewById(R.id.btnIniciar);
		Button parar = (Button) findViewById(R.id.btnParar);

		iniciar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				ServiceRss service = new ServiceRss();

				try {
					// Intent al Servicio
					Intent servicio = new Intent(Configuracion.this,
							ServiceRss.class);

					// Lo ejecutamos
					startService(servicio);
				} catch (Exception e) {
				}

			}
		});

		parar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				ServiceRss service = new ServiceRss();

				try {
					// Intent al Servicio
					Intent servicio = new Intent(Configuracion.this,
							ServiceRss.class);

					// Lo paramos
					stopService(servicio);

				} catch (Exception e) {
				}

			}
		});

	}

	

}
