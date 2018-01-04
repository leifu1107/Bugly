package leifu.bugly;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by Administrator on 2017/11/27.
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "leifu.bugly.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
