package br.nom.cruz.marcos.projetofinalandroiddev;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.nom.cruz.marcos.projetofinalandroiddev.builder.UserBuilder;
import br.nom.cruz.marcos.projetofinalandroiddev.facade.UserFacade;


public class FragmentCriaPerfil extends BaseFragment {


    private UserBuilder userBuilder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cria_perfil, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button salvarButton = (Button) getActivity().findViewById(R.id.buttonSalvar);
        salvarButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String nome = ((EditText) getActivity().findViewById(R.id.novoPerfilNome)).getText().toString();
        String password = ((EditText) getActivity().findViewById(R.id.novoPerfilPassword)).getText().toString();

        String logradouro=((EditText) getActivity().findViewById(R.id.endereco)).toString();

        String numero=((EditText) getActivity().findViewById(R.id.enderecoNumero)).toString();

        String cidade=((EditText) getActivity().findViewById(R.id.enderecoCidade)).toString();

        String uf=((EditText) getActivity().findViewById(R.id.enderecoUf)).toString();

        String complemento=((EditText) getActivity().findViewById(R.id.enderecoComplemento)).toString();

        String pais=((EditText) getActivity().findViewById(R.id.enderecoPais)).toString();

        userBuilder = new UserBuilder();
        userBuilder.criaUser()
                .setNome(nome)
                .setPassword(password)
                .criaEndereco()
                .setLogradouro(logradouro)
                .setNumero(numero)
                .setCidade(cidade)
                .setUf(uf)
                .setComplemento(complemento)
                .setPais(pais);


//        new AlertDialog.Builder(getContext())
//                .setTitle(R.string.mensagem_confirmacao_title)
//                .setMessage(R.string.mensagem_confirmacao_cadastro_title)
//                .setPositiveButton(R.string.sim, this)
//                .setNegativeButton(R.string.no, this)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .show();

<<<<<<< HEAD
=======
        showAlertConfirmDialog(getContext(),R.string.mensagem_confirmacao_cadastro_title,R.string.sim,R.string.no,this,android.R.drawable.ic_dialog_alert);

>>>>>>> 81b2cce7567e75810b5eeeb25ae778404da693c1
    }


    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        System.out.println(i);
        switch (i) {
            case -1:

                try {

                    new UserFacade((MainActivity) getActivity()).salvaUsuario(userBuilder.getUser());
                    super.showToastMessages(R.string.mensagem_confirmacao_criacao_perfil);
                    //VOLTA A FRAGMENT DE LOGIN
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.mainActivityContainer, new FragmentLogin())
                            .addToBackStack(null)
                            .commit();

                } catch (Exception e) {
                    e.printStackTrace();
                    showToastMessages(R.string.mensagem_erro_criar_perfil);
                }

        }


    }
}
