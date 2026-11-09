# Maryam Wi-Fi Scanner

A small Android project that discovers advertised HTTP services on the local Wi-Fi network using Android Network Service Discovery (NSD).

## Build from an Android phone using GitHub Actions
1. Create a new public or private GitHub repository in your browser.
2. Upload the **contents** of this project folder (including the hidden `.github` folder) to the repository. GitHub's web upload supports selecting files; ensure `.github/workflows/build-apk.yml` is included.
3. Open the repository's **Actions** tab.
4. Select **Build Maryam Wi-Fi Scanner APK** and tap **Run workflow**.
5. When the run finishes, open it and download the `Maryam-WiFi-Scanner-APK` artifact.
6. Extract the downloaded artifact ZIP and install `app-debug.apk`. Android may ask you to allow installs from your browser or file manager.

## Scope and limitations
- This discovers only services advertising `_http._tcp.` on the local network.
- It does not crack Wi-Fi passwords, access other people's routers, or find every connected device.
- This is a debug APK for personal testing, not a Play Store release.
