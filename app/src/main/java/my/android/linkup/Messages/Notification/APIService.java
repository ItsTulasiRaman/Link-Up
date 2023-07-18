package my.android.linkup.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BFqHPI-2qnblLgVOGnjsMM3T2kVuJKg17EwV9XarLsPec05J-l6q0YraF-paMa55guj4LHMWn16h2odUfWGroco"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
