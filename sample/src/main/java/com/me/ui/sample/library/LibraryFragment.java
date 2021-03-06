package com.me.ui.sample.library;

import com.me.ui.library.sample.FragmentBean;
import com.me.ui.library.sample.SampleListFragment;
import com.me.ui.sample.library.basic.LibraryBasicFragment;
import com.me.ui.sample.library.download.DownloadFragment;
import com.me.ui.sample.library.log.LogFragment;
import com.me.ui.sample.library.music.MusicFragment;
import com.me.ui.sample.library.permission.PermissionFragment;
import com.me.ui.sample.library.plugin.PluginFragment;
import com.me.ui.sample.library.security.EncryptFragment;
import com.me.ui.sample.pattern.PatternFragment;

import java.util.List;

/**
 * @author tangqi on 17-6-20.
 */
public class LibraryFragment extends SampleListFragment {

    @Override
    protected void addItems(List<FragmentBean> items) {
        items.add(new FragmentBean("基础", LibraryBasicFragment.class));
        items.add(new FragmentBean("加密", EncryptFragment.class));
        items.add(new FragmentBean("下载", DownloadFragment.class));
        items.add(new FragmentBean("日志", LogFragment.class));
        items.add(new FragmentBean("插件", PluginFragment.class));
        items.add(new FragmentBean("权限", PermissionFragment.class));
        items.add(new FragmentBean("模式", PatternFragment.class));
        items.add(new FragmentBean("音乐", MusicFragment.class));
    }
}
