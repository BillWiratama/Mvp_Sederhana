package com.example.mvp_sederhana.Presenter;


public class MainPresenterImp implements MainPresenter {

    MainView mainView ;

    public MainPresenterImp(MainView mainView)
    { this.mainView = mainView; }

    @Override
    public void hitungLuas(Double alas, Double tinggi) {
    Double luas = alas*tinggi;
    mainView.UpdateTextHasilluas(luas);

    }

    @Override
    public void hitungKeliling(Double panhang, Double lebar) {
        Double keliling = 2*(panhang+lebar);
        mainView.UpdateTextHasilkeliling(keliling);

    }
}
