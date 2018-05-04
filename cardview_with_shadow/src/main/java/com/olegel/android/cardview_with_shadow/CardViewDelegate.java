package com.olegel.android.cardview_with_shadow;

import android.graphics.drawable.Drawable;
import android.view.View;

public interface CardViewDelegate {
  void setCardBackground(Drawable drawable);
  Drawable getCardBackground();
  boolean getUseCompatPadding();
  boolean getPreventCornerOverlap();
  void setShadowPadding(int left, int top, int right, int bottom);
  void setMinWidthHeightInternal(int width, int height);
  View getCardView();
}
