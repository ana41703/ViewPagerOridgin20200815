package to.msn.wings.viewpagercustom;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import 	androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager.widget.PagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
public class PageAdapter extends FragmentStateAdapter{

//public class PageAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String[] titles = new String[] { "ゾウ", "キャラクター", "アザラシ" };

     PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.titles[position];
    }

    @Override
//    public Fragment getItem(int i) {
        public Fragment createFragment(int i) {
        switch(i){
            case 0:
                return new Page1Fragment();
            case 1:
                return new Page2Fragment();
            default:
                return new Page3Fragment();
        }
    }
}
