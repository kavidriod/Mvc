package com.ninja.mvc;

public interface Contract {

    interface View {
        void setString(String string);
    }

    interface Model{
        interface OnFinishedListener {
            void onFinished(String string);
        }
        void getLanguage(Contract.Model.OnFinishedListener onFinishedListener);
    }

    interface Presenter {
        void showLanguageOnButtonClick();
        void onDestroy();
    }
}
