# JSON Placeholder Posts Viewer

## Overview

This Android application is a straightforward implementation demonstrating the use of Android
development tools and practices. It fetches a list of posts from
the [JSON Placeholder API](https://jsonplaceholder.typicode.com/), a free fake online REST API, and
displays them in a RecyclerView. The project showcases the use of Retrofit for network requests and
the ViewModel for managing UI-related data in a lifecycle-conscious way.

## Features

- **Fetching Data**: Utilizes Retrofit to make network requests to the JSON Placeholder API.
- **Data Presentation**: Displays the fetched posts in a RecyclerView.
- **Architecture**: Follows the MVVM (Model-View-ViewModel) architectural pattern.
- **Lifecycle Awareness**: Uses ViewModel to handle data efficiently across configuration changes.

## Getting Started

To run this project, clone the repository and import it into Android Studio. Ensure you have an
internet connection for fetching data from the API.

```bash
git clone https://github.com/rjuarez1903/jsonplaceholder-posts-viewer
```

## Dependencies

- **Retrofit**: A type-safe HTTP client for Android and Java.
- **ViewModel**: Part of Android Jetpack, manages UI-related data in a lifecycle-conscious way.
- **RecyclerView**: A flexible view for providing a limited window into a large data set.

## How it Works

- **Retrofit**: Set up Retrofit to make network requests to the JSON Placeholder API.
- **ViewModel**: Fetch and hold the list of posts.
- **RecyclerView**: Display the posts in a scrollable list.

## Architecture

The application follows the MVVM architecture, separating the business logic and UI. The ViewModel
interacts with the model layer (network requests via Retrofit), and the activity/fragment observes
data changes, updating the UI accordingly.