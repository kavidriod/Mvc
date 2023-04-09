package com.ninja.mvc;

public class Presenter implements Contract.Presenter, Contract.Model.OnFinishedListener {

    private Contract.View view;
    private Contract.Model model;

    // instantiating the objects of View and Model Interface
    public Presenter(Contract.View mainView, Contract.Model model) {
        this.view = mainView;
        this.model = model;
    }

    @Override
    public void onFinished(String string) {
      if(view != null){
          view.setString(string);
      }
    }

    @Override
    public void showLanguageOnButtonClick() {
        model.getLanguage(this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }
}