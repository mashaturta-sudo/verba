# VerbaGuide

Інтерактивний довідник правил Verba Online.

## Build

- Java 17
- Gradle 8.9
- Android Gradle Plugin 8.7.3
- Kotlin 2.0.21

## Protection

Release builds use R8 minification and resource shrinking. The APK should be signed with a private release keystore before distribution.

Important: no Android application can be made literally impossible to reverse-engineer. The goal is to make casual modification and static inspection substantially harder and to prevent modified APKs from being accepted as the same signed application.
