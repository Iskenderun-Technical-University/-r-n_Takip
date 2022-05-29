package application;

import java.time.LocalDate;

import javafx.collections.ObservableList;
import javafx.scene.control.SpinnerValueFactory;

public class kayitlar {

	private String td_toptancý;
	private int td_urun;
	private int td_miktar;
	private String td_giristarih;
	private String td_sonodemetarih;
	private int td_alis;
	private String td_odeme;
	
	 kayitlar(String string, String string2, String string3, LocalDate localDate, LocalDate localDate2, String string4, ObservableList<String> observableList) {
		// TODO Auto-generated constructor stub
	}

	 kayitlar(String td_toptancý,int td_urun,int td_miktar,String td_giristarih,String td_sonodemetarih,int td_alis,String td_odeme){
		
		 this.td_toptancý=td_toptancý;
		 this.td_urun=td_urun;
		 this.td_miktar=td_miktar;
		 this.td_giristarih=td_giristarih;
		 this.td_sonodemetarih=td_sonodemetarih;
		 this.td_alis=td_alis;
		 this.td_odeme=td_odeme;
		 
		 
		
		
		 
	 }

	public kayitlar(String text, String text2, String text3, LocalDate value, LocalDate value2, String text4,
			SpinnerValueFactory<?> valueFactory) {
		// TODO Auto-generated constructor stub
	}

	public String getTd_toptancý() {
		return td_toptancý;
	}

	public void setTd_toptancý(String td_toptancý) {
		this.td_toptancý = td_toptancý;
	}

	public int getTd_urun() {
		return td_urun;
	}

	public void setTd_urun(int td_urun) {
		this.td_urun = td_urun;
	}

	public int getTd_miktar() {
		return td_miktar;
	}

	public void setTd_miktar(int td_miktar) {
		this.td_miktar = td_miktar;
	}

	public String getTd_giristarih() {
		return td_giristarih;
	}

	public void setTd_giristarih(String td_giristarih) {
		this.td_giristarih = td_giristarih;
	}

	public String getTd_sonodemetarih() {
		return td_sonodemetarih;
	}

	public void setTd_sonodemetarih(String td_sonodemetarih) {
		this.td_sonodemetarih = td_sonodemetarih;
	}

	public int getTd_alis() {
		return td_alis;
	}

	public void setTd_alis(int td_alis) {
		this.td_alis = td_alis;
	}

	public String getTd_odeme() {
		return td_odeme;
	}

	public void setTd_odeme(String td_odeme) {
		this.td_odeme = td_odeme;
	}
}
