// Generated code from Butter Knife. Do not modify!
package ru.yakstar.loginformmvp.view;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ru.yakstar.loginformmvp.R;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f070022;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.etMail = Utils.findRequiredViewAsType(source, R.id.etEmail, "field 'etMail'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'etPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnValid, "method 'submit'");
    view7f070022 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etMail = null;
    target.etPassword = null;

    view7f070022.setOnClickListener(null);
    view7f070022 = null;
  }
}
