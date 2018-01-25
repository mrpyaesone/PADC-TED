package com.ps.ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ps.ted.delegates.PlaylistItemDelegate;

/**
 * Created by pyaesone on 1/24/18.
 */

public class PlaylistViewHolder extends RecyclerView.ViewHolder {

    private PlaylistItemDelegate mPlaylistItemDelegate;

    public PlaylistViewHolder(View itemView, PlaylistItemDelegate playlistItemDelegate) {
        super(itemView);
        mPlaylistItemDelegate = playlistItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlaylistItemDelegate.onTapPlaylist();
            }
        });
    }
}