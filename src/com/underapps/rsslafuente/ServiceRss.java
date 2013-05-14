package com.underapps.rsslafuente;

import java.net.URL;
import java.util.List;

import com.underapps.rsslafuente.models.Noticia;
import com.underapps.rsslafuente.utils.RssParserPull;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;


public class ServiceRss extends Service {

	@Override
	public void onCreate() {
		ParserTask parser = new ParserTask();
		parser.execute("http://lafuenteunlp.com.ar/web/category/_mailpress_mailing_list_noticias/feed/");
		
	}



	@Override
	public IBinder onBind(Intent arg0) {
		
		return null;
	}

	
	
	private class ParserTask extends AsyncTask<String, Integer, List<Noticia>> {
	     protected List<Noticia> doInBackground(String... urls) {
	    	 
	    	RssParserPull rss = new RssParserPull(urls[0]);
	    	List<Noticia> lista = rss.parse();
	    	
			return lista;
	         
	    	 
	     }

	     protected void onProgressUpdate(Integer... progress) {
	    
	     }

	     protected void onPostExecute(List<Noticia> lista) {
	    	 for (Noticia noticia : lista) {
				Log.e("Noticia", noticia.toString());
			}
	     
	     }
	 }

}
