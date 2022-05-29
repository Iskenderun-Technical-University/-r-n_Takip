package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class uruntakipController {
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField d_alis;

    @FXML
    private AnchorPane d_ancher;

    @FXML
    private Button d_duzenlebtn;

    @FXML
    private Button d_eklebtn;
    
    
    @FXML
    private Button m_fisyazdirbtn;
    
    @FXML
    private Button d_fisyazdirbtn;

    @FXML
    private DatePicker d_giristarih;

    @FXML
    private TextField d_miktar;

    @FXML
    private RadioButton d_radiobtn;

    @FXML
    private Button d_silbtn;

    @FXML
    private DatePicker d_sonodemetarih;

    @FXML
    private TableView<kayitlar> d_table;
    
    @FXML
    private Spinner<Integer> d_taksit;
    
    @FXML
    private TextField d_toptancý;

    @FXML
    private TextField d_urun;

    @FXML
    private AnchorPane m_ancher;

    @FXML
    private Button m_duzenlebtn;

    @FXML
    private Button m_eklebtn;

    @FXML
    private TextField m_miktar;

    @FXML
    private TextField m_musteribilgi;

    @FXML
    private Text m_og;

    @FXML
    private RadioButton m_radiobtn;

    @FXML
    private TextField m_satilanurunno;

    @FXML
    private TextField m_satisfiyati;

    @FXML
    private Button m_silbtn;

    @FXML
    private DatePicker m_sonodemetarihi;

    @FXML
    private TableView<?> m_table;

    @FXML
    private Spinner<Integer> m_taksit;

    @FXML
    private Tab tab_depo;

    @FXML
    private Tab tab_musteri;

    @FXML
    private TabPane table_depo;

    @FXML
    private TableColumn<kayitlar, Integer> td_alis;

    @FXML
    private TableColumn<kayitlar, String> td_giristarih;

    @FXML
    private TableColumn<kayitlar, Integer> td_miktar;

    @FXML
    private TableColumn<kayitlar, String> td_odeme;

    @FXML
    private TableColumn<kayitlar, String> td_sonodemetarih;

    @FXML
    private TableColumn<kayitlar, String> td_toptancý;

    @FXML
    private TableColumn<kayitlar, Integer> td_urun;

    @FXML
    private TextArea d_textarea;
    
    @FXML
    private TableColumn<?, ?> tm_miktar;

    @FXML
    private TableColumn<?, ?> tm_musteribilgi;

    @FXML
    private TableColumn<?, ?> tm_odeme;

    @FXML
    private TableColumn<?, ?> tm_satilanurunno;

    @FXML
    private TableColumn<?, ?> tm_sonodemetarihi;

    @FXML
    private TableColumn<?, ?> tm_taksit;
    
    @FXML
    private TextArea m_textarea;
    
    ObservableList<kayitlar> veriler;
    
    @FXML
    void d_duzenlebtnclck(ActionEvent event) {

    }

    @FXML
    void d_eklebtnclck(ActionEvent event) {
    	
    	veriler=FXCollections.observableArrayList();
    	veriler.add(new kayitlar(d_toptancý.getText(),d_urun.getText(),d_miktar.getText(),d_giristarih.getValue(),d_sonodemetarih.getValue(),d_alis.getText(),d_taksit.getValueFactory()));
d_table.getItems().addAll(veriler);
     
    
    }
    
    

    @FXML
    void d_fisyazdirbtnclck(ActionEvent event) {
    	d_textarea.setText(d_toptancý.getText()+"\n"+d_urun.getText()+"\n"+d_miktar.getText()+"\n"+d_giristarih.getValue()+"\n"+d_sonodemetarih.getValue()+"\n"+d_alis.getText()+"\n"+d_taksit.getValue());
        
    }

    @FXML
    void d_radiobtnclck(ActionEvent event) {

    }

    @FXML
    void d_silbtnclck(ActionEvent event) {
    	
    	d_textarea.setText("");
    	d_toptancý.setText("");
    	d_urun.setText("");
    	d_miktar.setText("");
    	d_giristarih.setValue(null);
    	d_sonodemetarih.setValue(null);
    	d_alis.setText("");
   
    }

    @FXML
    void dtableclck(MouseEvent event) {

    	kayitlar kayit= new kayitlar (null, 0, 0, null, null, 0, null);
    	kayit=(kayitlar) d_table.getItems().get(d_table.getSelectionModel().getSelectedIndex());
    	d_toptancý.setText(kayit.getTd_toptancý());
        
    	
    	
    	
    	
    }

    @FXML
    void m_duzenlebtnclck(ActionEvent event) {

    }

    @FXML
    void m_eklebtnclck(ActionEvent event) {
    	
    }
    
    @FXML
    void m_fisyazdirbtnclck(ActionEvent event) {

    }

    @FXML
    void m_silbtnclck(ActionEvent event) {

    }

    @FXML
    void mtableclck(MouseEvent event) {

    }
   
 
    
    @FXML
    void initialize() {
    	
    d_eklebtn.setTooltip(new Tooltip("Girilen iþlemleri tablonuza ekler"));
    d_silbtn.setTooltip(new Tooltip("Girilen iþlemlerin tümünü siler"));
    d_duzenlebtn.setTooltip(new Tooltip("Girilen iþlemleri düzenler"));
    d_fisyazdirbtn.setTooltip(new Tooltip("Son alýþ-veriþ dökümanýný yazdýrmaya yarar"));
    
    m_eklebtn.setTooltip(new Tooltip("Girilen iþlemleri tablonuza ekler"));
    m_silbtn.setTooltip(new Tooltip("Girilen iþlemlerin tümünü siler"));
    m_duzenlebtn.setTooltip(new Tooltip("Girilen iþlemleri düzenler"));
    m_fisyazdirbtn.setTooltip(new Tooltip("Son alýþ-veriþ dökümanýný yazdýrmaya yarar"));
     
    td_alis.setVisible(false);
    
    veriler=FXCollections.observableArrayList();
    veriler.add(new kayitlar("Okay Gülmez",1,200,"5/24/2022","6/24/2022",500,"Peþin"));
    veriler.add(new kayitlar("Karþý komþu",2,450,"7/22/2022","8/26/2022",8500,"Taksit"));
    veriler.add(new kayitlar("Tesla",5,200,"5/24/2022","6/24/2022",500,"Peþin"));
    
    td_toptancý.setCellValueFactory(new PropertyValueFactory<>("td_toptancý"));
    td_urun.setCellValueFactory(new PropertyValueFactory<>("td_urun"));
    td_miktar.setCellValueFactory(new PropertyValueFactory<>("td_miktar"));
    td_giristarih.setCellValueFactory(new PropertyValueFactory<>("td_giristarih"));
    td_sonodemetarih.setCellValueFactory(new PropertyValueFactory<>("td_sonodemetarih"));
    td_alis.setCellValueFactory(new PropertyValueFactory<>("td_alis"));
    td_odeme.setCellValueFactory(new PropertyValueFactory<>("td_odeme"));
    
    d_table.setItems(veriler);
  
    int secilen=2;

    SpinnerValueFactory<Integer> deger1=new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 12, secilen);
    //(baslangic, bitis, secili)
    d_taksit.setValueFactory(deger1);
    assert d_alis != null : "fx:id=\"d_alis\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_ancher != null : "fx:id=\"d_ancher\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_duzenlebtn != null : "fx:id=\"d_duzenlebtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_eklebtn != null : "fx:id=\"d_eklebtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_fisyazdirbtn != null : "fx:id=\"d_fisyazdirbtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_giristarih != null : "fx:id=\"d_giristarih\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_miktar != null : "fx:id=\"d_miktar\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_radiobtn != null : "fx:id=\"d_radiobtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_silbtn != null : "fx:id=\"d_silbtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_sonodemetarih != null : "fx:id=\"d_sonodemetarih\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_table != null : "fx:id=\"d_table\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_taksit != null : "fx:id=\"d_taksit\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_textarea != null : "fx:id=\"d_textarea\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_toptancý != null : "fx:id=\"d_toptancý\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert d_urun != null : "fx:id=\"d_urun\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_ancher != null : "fx:id=\"m_ancher\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_duzenlebtn != null : "fx:id=\"m_duzenlebtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_eklebtn != null : "fx:id=\"m_eklebtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_fisyazdirbtn != null : "fx:id=\"m_fisyazdirbtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_miktar != null : "fx:id=\"m_miktar\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_musteribilgi != null : "fx:id=\"m_musteribilgi\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_radiobtn != null : "fx:id=\"m_radiobtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_satilanurunno != null : "fx:id=\"m_satilanurunno\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_satisfiyati != null : "fx:id=\"m_satisfiyati\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_silbtn != null : "fx:id=\"m_silbtn\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_sonodemetarihi != null : "fx:id=\"m_sonodemetarihi\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_table != null : "fx:id=\"m_table\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_taksit != null : "fx:id=\"m_taksit\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert m_textarea != null : "fx:id=\"m_textarea\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tab_depo != null : "fx:id=\"tab_depo\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tab_musteri != null : "fx:id=\"tab_musteri\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert table_depo != null : "fx:id=\"table_depo\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_alis != null : "fx:id=\"td_alis\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_giristarih != null : "fx:id=\"td_giristarih\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_miktar != null : "fx:id=\"td_miktar\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_odeme != null : "fx:id=\"td_odeme\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_sonodemetarih != null : "fx:id=\"td_sonodemetarih\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_toptancý != null : "fx:id=\"td_toptancý\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert td_urun != null : "fx:id=\"td_urun\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_miktar != null : "fx:id=\"tm_miktar\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_musteribilgi != null : "fx:id=\"tm_musteribilgi\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_odeme != null : "fx:id=\"tm_odeme\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_satilanurunno != null : "fx:id=\"tm_satilanurunno\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_sonodemetarihi != null : "fx:id=\"tm_sonodemetarihi\" was not injected: check your FXML file 'uruntakip.fxml'.";
    assert tm_taksit != null : "fx:id=\"tm_taksit\" was not injected: check your FXML file 'uruntakip.fxml'.";
    }

}
