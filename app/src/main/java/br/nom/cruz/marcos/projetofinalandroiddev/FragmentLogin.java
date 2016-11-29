package br.nom.cruz.marcos.projetofinalandroiddev;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by marcospcruz on 19/11/16.
 */

public class FragmentLogin extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView= inflater.inflate(R.layout.fragment_log_in, container, false);

        return fragmentView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button loginButton = (Button) getActivity().findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
        //
        TextView criarPerfil = (TextView) getActivity().findViewById(R.id.criarPerfil);
        criarPerfil.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.criarPerfil:
//                    Util.changeFragment(getFragmentManager(), ConstantsEnum.FRAGMENT_CRIA_PERFIL.getName());
                    getFragmentManager().popBackStack();
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.mainActivityContainer,new FragmentCriaPerfil())
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.loginButton:


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
