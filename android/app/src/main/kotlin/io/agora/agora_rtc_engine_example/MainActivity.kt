package io.agora.agora_rtc_engine_example

import android.os.Bundle
import io.agora.agora_rtc_engine_example.custom_capture_audio.CustomCaptureAudioPlugin
import io.agora.agora_rtc_engine_example.custom_capture_audio.CustomCaptureAudio
import io.agora.rtc.base.RtcEnginePlugin
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import java.lang.ref.WeakReference

class MainActivity: FlutterActivity() {

  private val customCaptureAudioPlugin = CustomCaptureAudioPlugin(WeakReference(this))

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // Register the `CustomCaptureAudioPlugin` to interect with the `RtcEngine`
    RtcEnginePlugin.register(customCaptureAudioPlugin)
  }

  override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
    super.configureFlutterEngine(flutterEngine)
    // The `CustomCaptureAudioPlugin` is generated by [pigeon](https://pub.dev/packages/pigeon), you can see the
    // the definiton on `example/lib/examples/advanced/custom_audio/custom_audio_source_api.dart`
    CustomCaptureAudio.CustomCaptureAudioApi.setup(flutterEngine.dartExecutor, customCaptureAudioPlugin)
  }

  override fun onDestroy() {
    super.onDestroy()

    RtcEnginePlugin.unregister(customCaptureAudioPlugin)
  }
}
