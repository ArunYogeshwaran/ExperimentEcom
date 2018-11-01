// Generated code from Butter Knife. Do not modify!
package com.example.ayogeshwaran.wishersvalley.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.ayogeshwaran.wishersvalley.R;
import com.google.android.gms.ads.AdView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivityFragment_ViewBinding implements Unbinder {
  private MainActivityFragment target;

  @UiThread
  public MainActivityFragment_ViewBinding(MainActivityFragment target, View source) {
    this.target = target;

    target.adView = Utils.findRequiredViewAsType(source, R.id.adView, "field 'adView'", AdView.class);
    target.mainGridView = Utils.findRequiredViewAsType(source, R.id.main_grid_view, "field 'mainGridView'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivityFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.adView = null;
    target.mainGridView = null;
  }
}
