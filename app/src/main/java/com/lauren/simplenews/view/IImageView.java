package com.lauren.simplenews.view;

import com.whiskeyfei.mvp.base.IMVPBaseView;
import com.lauren.simplenews.beans.ImageBean;

import java.util.List;

/**
 * Description :
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/22
 */
public interface IImageView extends IMVPBaseView{
    void onSuccess(List<ImageBean> list);

    void showProgress();

    void hideProgress();

    void showLoadFailMsg();
}
