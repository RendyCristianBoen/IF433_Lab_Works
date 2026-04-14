package oop_130679_RendyCristianBoen.week08

class NotificationService {

    fun sendEmailNotification(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        } else {
            println("Email not available")
        }
    }
}