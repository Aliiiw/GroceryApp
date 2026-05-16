# Grocery App

Grocery App is a native Android Jetpack Compose UI sample for a grocery shopping home screen. It shows a search-focused store landing page with wallet information, promotional cards, product categories, and best-seller product cards.

The UI concept and inspiration came from this Dribbble design: [Grocery App](https://dribbble.com/shots/15948766-Grocery-App).

## Features

- Jetpack Compose grocery store home screen
- Curved orange header background
- Search bar with search, favorites, and notification actions
- QR/scan button area
- Wallet balance and points summary card
- Horizontal promotion carousel
- Category shortcuts for fruits, vegetables, dairy, and meats
- Best-seller product cards with image, price, and discount label
- Reusable Compose components for cards, categories, dividers, and buttons
- Custom Nunito font family
- Local drawable assets for grocery products and icons
- Static UI sample with no backend dependency

## Tech Stack

- Kotlin
- Android Jetpack Compose
- Compose Material
- AndroidX Activity Compose
- Gradle / Android Gradle Plugin
- JUnit and AndroidX test dependencies

## Project Structure

```text
.
+-- README.md
+-- build.gradle
+-- settings.gradle
+-- gradle.properties
+-- app/
|   +-- build.gradle
|   +-- src/main/
|       +-- AndroidManifest.xml
|       +-- java/com/alirahimi/groceryapp/
|       |   +-- MainActivity.kt
|       |   +-- MainTheme.kt
|       |   +-- screens/
|       |   |   +-- HomeScreen.kt
|       |   |   +-- Content.kt
|       |   |   +-- AppBar.kt
|       |   |   +-- Header.kt
|       |   |   +-- QrButton.kt
|       |   |   +-- VerticalDivider.kt
|       |   |   +-- Promotions.kt
|       |   |   +-- ShopItems.kt
|       |   |   +-- CategoriesSection.kt
|       |   |   +-- CategoryButton.kt
|       |   |   +-- BestSellerSection.kt
|       |   |   +-- BestSellerItems.kt
|       |   +-- ui/theme/
|       |       +-- Color.kt
|       |       +-- Shape.kt
|       |       +-- Theme.kt
|       |       +-- Type.kt
|       +-- res/
|           +-- drawable/
|           +-- font/
|           +-- values/
```

## Main Components

| Component | Purpose |
| --- | --- |
| `MainActivity` | Starts the Compose UI and renders `HomeScreen`. |
| `MainTheme` | Helper wrapper around `GroceryAppTheme` and `Surface`. |
| `HomeScreen` | Places the curved background and transparent `Scaffold`. |
| `Content` | Arranges the header, promotions, categories, and best sellers. |
| `AppBar` | Search field plus favorite and notification icons. |
| `Header` | Balance, top-up, points, and QR scan summary card. |
| `QrButton` | Reusable scan icon button. |
| `Promotions` | Horizontal promotional cards for fruit and meat deals. |
| `ShopItems` | Reusable promotion card composable. |
| `CategoriesSection` | Category header and four category shortcut buttons. |
| `CategoryButton` | Reusable category tile with icon and label. |
| `BestSellerSection` | Section header for best-seller products. |
| `BestSellerItems` | Horizontal list of best-seller product cards. |
| `BestSellerItem` | Reusable product card with discount display. |
| `VerticalDivider` | Small divider used inside the header card. |

## Screen Content

The current static screen includes:

| Section | Content |
| --- | --- |
| Search | `Search food, vegetable and ...` |
| Wallet | `$130` balance with `Top Up` label |
| Points | `20` points |
| Promotions | Fruit starts at `$1`, meat discount `20%` |
| Categories | Fruits, Vegetables, Dairy, Meats |
| Best sellers | Iceberg Lettuce, Apple, Meat |

Best-seller cards include prices and discount tags:

| Product | Price | Discount |
| --- | --- | --- |
| Iceberg Lettuce | `$1.99` | `10%` |
| Apple | `$2.23` | `5%` |
| Meat | `$3.73` | `15%` |

## UI Assets

The project includes local assets for:

- Main orange background vector: `bg_main.xml`
- Promotion image: `promotion.png`
- Product images: `item_lettuce.png`, `item_apple.png`, `item_meat.png`
- Category icons: orange, vegetable, cheese, and meat
- Utility icons: scan, money, and coin
- Nunito font files: light, regular, and bold

## Theme

The theme uses a simple orange Material palette:

| Token | Value |
| --- | --- |
| `Orange` | `#F2994A` |
| Primary | `Orange` |
| Primary Variant | `Orange` |
| Secondary | `Orange` |

Typography uses the local Nunito font family through `Type.kt`.

## Requirements

- Android Studio
- JDK 8 or newer
- Android SDK with compile SDK 32
- Android device or emulator running Android 5.0+ because `minSdk` is 21

Project configuration:

| Setting | Value |
| --- | --- |
| Application ID | `com.alirahimi.groceryapp` |
| Min SDK | 21 |
| Target SDK | 32 |
| Compile SDK | 32 |
| Version | 1.0 |
| Android Gradle Plugin | 7.1.3 |
| Kotlin Plugin | 1.5.21 |
| Compose Version | 1.0.1 |

## How to Run

Open the project in Android Studio, let Gradle sync, then run the `app` configuration on an emulator or Android device.

From the terminal:

```bash
./gradlew assembleDebug
```

Install on a connected device:

```bash
./gradlew installDebug
```

## Notes

- This repository is a UI sample, not a full grocery shopping platform.
- Search, favorite, notification, QR scan, top-up, points, category, and more buttons currently use placeholder click handlers.
- Products, promotions, prices, and discounts are hard-coded in composables.
- The app uses local assets and does not require network access.

## Possible Improvements

- Add screenshot or demo GIF assets to the README
- Move products, categories, and promotions into model classes
- Add ViewModel state for search and selected categories
- Implement navigation for product details and category lists
- Add cart actions and quantity controls
- Add Compose previews for reusable components
- Add dark mode colors
- Update Compose, Kotlin, and Android Gradle Plugin versions
