package br.nom.cruz.marcos.projetofinalandroiddev;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

/**
 * Created by marcospcruz on 20/11/16.
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener,DialogInterface.OnClickListener{

    /**
     * Método responsável em mostrar mensagem na tela.
     * Deve se usar valores do string.xml
     * @param mensagem
     */
    public void showToastMessages(int mensagem) {
        Toast.makeText(getContext(),mensagem,Toast.LENGTH_LONG).show();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param context
     * @param title
     * @param yesButtonLabel
     * @param noButtonLabel
     * @param dialogListener
     * @param icon
     */
    protected void showAlertConfirmDialog(Context context, int title, int yesButtonLabel, int noButtonLabel, DialogInterface.OnClickListener dialogListener, int icon) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(R.string.mensagem_confirmacao_cadastro_title)
                .setPositiveButton(yesButtonLabel, dialogListener)
                .setNegativeButton(noButtonLabel, dialogListener)
                .setIcon(icon)
                .show();
    }

}
