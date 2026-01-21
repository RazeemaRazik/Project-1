package lk.razee.practical_1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import lk.razee.practical_1.fragment.SignInFragment;
import lk.razee.practical_1.fragment.SignUpFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        if (position == 1){
            return new SignUpFragment();
        }
        return  new SignInFragment();
    }

    @Override
    public int getItemCount(){
        return 2;
    }
}
