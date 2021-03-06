package com.eegeo.apisamples;

/**
 * A list of all the examples.
 */
public final class ExamplesList {

    public static final ExampleContainer[] Examples = {
            new ExampleContainer(R.string.basic_example_label,
                    R.string.basic_example_description,
                    BasicMapActivity.class),
            new ExampleContainer(R.string.move_camera_example_label,
                    R.string.move_camera_example_description,
                    MoveCameraActivity.class),
            new ExampleContainer(R.string.animate_camera_example_label,
                    R.string.animate_camera_example_description,
                    AnimateCameraActivity.class),
            new ExampleContainer(R.string.framing_camera_example_label,
                    R.string.framing_camera_example_description,
                    FrameCameraActivity.class),
            new ExampleContainer(R.string.query_camera_example_label,
                    R.string.query_camera_example_description,
                    QueryCameraActivity.class),
            new ExampleContainer(R.string.picking_camera_example_label,
                    R.string.picking_camera_example_description,
                    PickingCameraActivity.class),
            new ExampleContainer(R.string.exit_indoor_example_label,
                    R.string.exit_indoor_example_description,
                    ExitIndoorExampleActivity.class),
            new ExampleContainer(R.string.name_indoor_example_label,
                    R.string.name_indoor_example_description,
                    NameIndoorExampleActivity.class),
            new ExampleContainer(R.string.move_floor_indoor_example_label,
                    R.string.move_floor_indoor_example_description,
                    MoveIndoorExampleActivity.class),
            new ExampleContainer(R.string.ux_floor_indoor_example_label,
                    R.string.ux_floor_indoor_example_description,
                    UXIndoorExampleActivity.class),
            new ExampleContainer(R.string.add_marker_example_label,
                    R.string.add_marker_example_description,
                    AddMarkerActivity.class),
            new ExampleContainer(R.string.marker_custom_icon_example_label,
                    R.string.marker_custom_icon_example_description,
                    MarkerCustomIconActivity.class),
            new ExampleContainer(R.string.marker_with_elevation_example_label,
                    R.string.marker_with_elevation_example_description,
                    MarkerWithElevationActivity.class),
            new ExampleContainer(R.string.marker_with_absolute_altitude_example_label,
                    R.string.marker_with_absolute_altitude_example_description,
                    MarkerWithAbsoluteAltitudeActivity.class),
            new ExampleContainer(R.string.add_indoor_marker_example_label,
                    R.string.add_indoor_marker_example_description,
                    AddIndoorMarkerActivity.class),
            new ExampleContainer(R.string.marker_change_text_example_label,
                    R.string.marker_change_text_example_label_description,
                    MarkerChangeTextActivity.class),
            new ExampleContainer(R.string.marker_change_location_example_label,
                    R.string.marker_change_location_example_description,
                    MarkerChangeLocationActivity.class),
            new ExampleContainer(R.string.marker_tapped_notification_example_label,
                    R.string.marker_tapped_notification_example_description,
                    MarkerTappedNotificationActivity.class),
            new ExampleContainer(R.string.marker_change_draw_order_example_label,
                    R.string.marker_change_draw_order_example_description,
                    MarkerChangeDrawOrderActivity.class),
            new ExampleContainer(R.string.streaming_complete_notification_example_label,
                    R.string.streaming_complete_notification_example_description,
                    StreamingCompleteNotificationActivity.class),
            new ExampleContainer(R.string.map_options_example_label,
                    R.string.map_options_example_description,
                    EegeoMapOptionsActivity.class),

    };

    // Pure static class
    private ExamplesList() {
    }
}
