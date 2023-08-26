# Development of a lightweight android application for federated learning using android studio and tensorflowlite
Federated learning (often referred to as collaborative learning) is a decentralized approach to training machine learning models. It doesn't require an exchange of data from client devices to global servers. Instead, the raw data on edge devices is used to train the model locally, increasing data privacy.
The task was to create an android application implementing on-device inference and on-device training of machine learning model using TensorFlow Lite. 
The app combines three essential features: login and registration, data save and retrieval from Firebase, and two types of models, first one being a digit classification model to predict digit in an image and second begin an image classification model to predict object in an image.

# Features
1.	Login and Registration: Users can create an account or log in using their credentials. This feature ensures secure access to the app and enables personalized experiences for each user.
2.	Data Save and Retrieval from Firebase: Users can save and retrieve data from Firebase, a real-time database provided by Google. This feature allows for seamless data synchronization across multiple devices.
3.	Digit Classification Model: The app utilizes a TensorFlow Lite model trained to classify digit in an image. Users can upload an image containing a handwritten digit, and the model will predict the digit accurately.
4.	Image Classification Model: It also utilizes TensorFlow Lite model to train and classify object in an image. Users can upload an image containing an object, and the model will predict the object accurately.
5.	On-Device Training: The app enables on-device training of a machine learning model. Users can contribute their own image data to train the model, eliminating the need for data transfer to a remote server.
6.	Inference: The trained model can be used for inference to classify digits or objects in real-time. Users can upload an image and the model will predict the digit or object accurately.
7.	Save and Restore Functionalities: The app provides functionalities to save and restore training progress. Users can pause training and resume from the saved state at a later time.
   
# Implementation Details
The on-device training is implemented as follows:
1.	The app includes a machine learning model that can be trained in real time.
2.	During training, the app collects training data from the user, pre-processes it, and feeds it into the training model.
3.	The app uses techniques such as transfer learning or fine-tuning to update the weights of the training model using the collected data.
4.	The updated model is then saved and can be used for inference on the device.
5.	To enable save and restore functionalities, the app saves the current model state periodically during training. The model state includes the weights, optimizer state, and other necessary parameters.
6.	When training is resumed, the app restores the saved model state and continues training from where it left off.

# Requirements
To set up and run this project, you need the following:
1. Android Studio (version X.X.X or higher): The integrated development environment (IDE) for Android app development.
2. Java Development Kit (JDK): Make sure you have Java installed on your machine.
3. An Android device or emulator: To run the app and test its functionality.
4. TensorFlow Lite: The TensorFlow Lite library is required for machine learning model development and training.
5. Firebase account: You need a Firebase account to set up the real-time database and enable data synchronization.

# Setup Instructions
Follow these steps to set up the project:
1. Clone the following repository to your local machine.
2. Open Android Studio and select "Open an existing Android Studio project."
3. Navigate to the cloned repository's directory and select the project.
4. Connect your Android device to your machine or set up an emulator.
5. Ensure that your device/emulator has developer options and USB debugging enabled.
6. Build and run the project on your device/emulator.
7. Install the required dependencies for TensorFlow Lite.
8. Set up a Firebase project and create a real-time database.
9. Update the Firebase configuration details in the app to connect to your Firebase project.
10. Build and run the project again to ensure everything is set up correctly.
   
# Usage
1.	If you are a new user, register with your credentials to create an account. If you are an existing user, log in using your credentials.
2.	Explore the app's features, including data save and retrieval from Firebase.
3.	To use the digit classification model: Upload an image containing a handwritten digit, Submit the image to the model for prediction and The app will display the predicted digit and accuracy.
4.	To use the image classification model: Upload an image containing an object, Submit the image to the model for prediction and The app will display the predicted object and accuracy.

# Results
1.	Implemented on-device Training of machine learning model using Tensorflow lite, achieving faster processing and reducing reliance on external servers.
2.	Integrated Tensorflow Lite ML model into Android Application.
3.	Trained digit recognition machine learning model in Python using MNIST dataset.
4.	Trained object recognition machine learning model in Python using CIFAR10 dataset.
   
# Future Scope
The future enhancements for this project include:
1.	Implementing transfer learning techniques to improve the training efficiency and reduce the need for large amounts of user data.
2.	Adding data augmentation techniques to increase the diversity and size of the training dataset. 
3.	Implementing privacy-preserving techniques, such as federated learning, to train the model collaboratively across multiple devices while protecting user data. 
4.	Integrating an active learning approach to intelligently select the most informative samples from user-contributed data for training.
   
# Resources
Resources referred to successfully create the project are as following:

•	Android Studio Documentation

•	TensorFlow Lite Documentation

•	Firebase Documentation
