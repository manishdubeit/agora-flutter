/// Get your own App ID at https://dashboard.agora.io/
String get appId {
  // Allow pass an `appId` as an environment variable with name `TEST_APP_ID` by using --dart-define
  return const String.fromEnvironment('TEST_APP_ID',
      defaultValue: '026012a565484fd59d26e0cc386a42f8');
}

// app_certificate: 25250fe6b2c949afb666fbf1f9ecb7e0

/// Please refer to https://docs.agora.io/en/Agora%20Platform/token
String get token {
  // Allow pass a `token` as an environment variable with name `TEST_TOKEN` by using --dart-define
  return const String.fromEnvironment('TEST_TOKEN',
      defaultValue:
          '006026012a565484fd59d26e0cc386a42f8IAB1Gz9BjAQuLNmYU/V4r9phtWi30jpNXpkGmvJ45HPtzHz15P4AAAAAEADVSeJsX8VsYgEAAQBfxWxi');
}

/// Your channel ID
String get channelId {
  // Allow pass a `channelId` as an environment variable with name `TEST_CHANNEL_ID` by using --dart-define
  return const String.fromEnvironment(
    'TEST_CHANNEL_ID',
    defaultValue: 'md-video-test-flutter',
  );
}

/// Your int user ID
const int uid = 0;

/// Your user ID for the screen sharing
const int screenSharingUid = 10;

/// Your string user ID
const String stringUid = '0';
