# StepZen 

## Disclosure: 

This app was created for the Project for CS 639 Mobile App Development Class at Pace University in Fall 2025.

## Team

[Urooj Fatima](https://github.com/uroojf-dev/CS639-Project)

[Mohammed Abubakar Tahir](https://github.com/iabubakartahir/CS639)

## About The App

Stepzen is a lightweight health-tracking app designed to help users stay consistent with their daily wellness habits.
Whether you want to drink more water, track meals, or view past history, Stepzen makes it simple with a clean and intuitive interface built using Jetpack Compose.

With features like daily water logging, meal tracking, history view, and Firebase integration, Stepzen helps users take control of their health in a clear, visual way.

## Idea Proposal 

We provided one concept for the app in this proposal.

 Access the full document
[StepZen Idea Proposal](https://docs.google.com/document/d/15ZhHljdnuwb5VA18MsCNiPxTgsVtoU1xwxGHiqXkDXM/edit?tab=t.0)


## Design

You can view the full UI/UX design of this app:
[Design Document](https://docs.google.com/document/d/1b0YcHOvCjZbMvjmG1peLfZg-ykPSEXww0Yrqj_1p_Uk/edit?usp=sharing)

## Main Features
### Water Intake Tracking

Add cups of water with a single tap

Instant counter showing total water consumed today

Progress refreshes daily

### Meal Logging

Type and save meals throughout the day

Delete meals easily

All meals stored per user in the database

### History View

See previous days’ water intake and meal logs

Data retrieved from Firebase in real time

### Authentication

Secure login and signup using Firebase Authentication

Keeps users logged in across app restarts

### Cloud Synchronization

All data (water count + meals + history) saved in Firestore

Automatic sync across devices

### Clean Jetpack Compose UI

Smooth animations, Material 3, and modern Compose layouts

Works on light and dark modes

## Technologies

| Technology                   | Used For          | Logic / How It Works                                                                                 |
| ---------------------------- | ----------------- | ---------------------------------------------------------------------------------------------------- |
| **Kotlin + Jetpack Compose** | UI + App Logic    | Declarative UI, state slots, and reactive updates with `remember`, `mutableStateOf`, and ViewModels. |
| **Firebase Authentication**  | User Accounts     | Sign-up, login, session persistence.                                                                 |
| **Firebase Firestore**       | Cloud Database    | Stores water logs, meal entries, and history for each user.                                          |
| **ViewModel + StateFlow**    | State Management  | Keeps UI reactive and survives configuration changes.                                                |
| **Material Design 3**        | UI Components     | Buttons, text fields, snackbars, cards, dynamic color.                                               |
| **Navigation Compose**       | Multi-screen Flow | Handles screen navigation (Home → Dashboard → History).                                              |

## App Screens

### 1. Home Screen

Signup

Login

### 2. Dashboard

Top section → Water Intake Tracker
Bottom section → Meal Log + Add Meal Box
Button → History

### 3. History Screen

Shows past entries

Displays water count + meals per day

Fetched from Firestore

## Learning Experience & Challenges

### Jetpack Compose Learning Curve

Gained strong understanding of state management, composable functions, and UI recomposition.

### Navigation Between Screens

Learned to pass data between composables and manage route structure.

### Firebase Integration

Faced challenges adding Firebase to the project, fixing Gradle versions, JSON configuration, and syncing authentication & Firestore with Compose.

### Asynchronous Programming

Used Kotlin Coroutines and suspend functions to read/write cloud data without blocking the UI.

### App Testing

Tested layout on different emulators and screen sizes within Android Studio.

## Future Improvements

Automated water reminders

Weekly charts and analytics

Adding step-tracking via Health Connect

AI-generated meal suggestions

Notification system

Dark mode customization

## Screenshots

![WhatsApp Image 2025-12-13 at 10 33 20 AM](https://github.com/user-attachments/assets/40d977f3-b2b8-4070-a9dd-574f901d3371) ![WhatsApp Image 2025-12-13 at 10 33 10 AM](https://github.com/user-attachments/assets/83379f25-3922-420b-8bd8-b9cb24c81c5f)

![WhatsApp Image 2025-12-13 at 10 32 52 AM](https://github.com/user-attachments/assets/184ccab2-9ce5-49b3-a0f3-7d01d74096fb) ![WhatsApp Image 2025-12-13 at 10 40 15 AM](https://github.com/user-attachments/assets/23e4f0ab-0e33-4b2f-b7af-b31ec7a9360e)


