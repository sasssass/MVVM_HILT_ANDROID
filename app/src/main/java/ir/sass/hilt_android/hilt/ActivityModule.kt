package ir.sass.hilt_android.hilt

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ir.sass.hilt_android.api.RemoteErrorEmitter
import ir.sass.hilt_android.view.MainActivity

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {
    @Provides
    fun provideRemoteErrorEmitter(activity : Activity) : RemoteErrorEmitter{
        return (activity as MainActivity)
    }
}