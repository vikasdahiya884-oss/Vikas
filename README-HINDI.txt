DAHIYA AI Phone — Android source prototype (not an APK)

WHAT WORKS IN SOURCE:
- Request Android default Phone/Dialer role
- InCallService callback for incoming calls
- Incoming-call notification and simple Attend / Decline UI
- AI Attend DEMO button explains that cellular call AI is not implemented

IMPORTANT LIMITATIONS:
- This is uncompiled starter source; needs Android Studio/Gradle to build and test.
- Incoming call screen/notification behavior varies by Samsung/Android version, permissions, lockscreen, and notification settings.
- Default Dialer requirements may need more UI and outgoing-call handling for production use.
- The AI button does NOT answer calls or talk to callers. Android third-party apps do not get arbitrary two-way cellular call audio.
- Do not replace your everyday dialer with this prototype before testing on a spare device. Emergency calls and outgoing dialing are NOT implemented.

BUILD:
1. Open this folder in Android Studio (or compatible Android build environment).
2. Sync Gradle, install Android SDK 35, build debug APK.
3. Test on spare Samsung phone. Grant default Phone role when prompted.
4. For real AI conversation, plan a separate consent-aware VoIP / telephony provider solution and secure server.
