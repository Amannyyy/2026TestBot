package frc.robot.subsystems.Vision;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;

public class VisionConstants {

    public static AprilTagFieldLayout aprilTagFieldLayout =
            AprilTagFields.kDefaultField.loadAprilTagLayoutField();

    public static double Field_Width =
            aprilTagFieldLayout.getFieldWidth();

    public static String camera1Name = "ArducamLeft";
    public static String camera2Name = "ArducamRight";
    public static String camera3Name = "ArducamFront";
    public static String camera4Name = "ArducamBack";

    public static Transform3d robotToCamera1 =
            new Transform3d(
                    new Translation3d( //Position of camera relative to robot center view (Check CAD for exact position)
                            Units.inchesToMeters(0), // x
                            Units.inchesToMeters(0), // y
                            Units.inchesToMeters(0)), // z
                    new Rotation3d(0, 0, 0));
                    //roll = tilted left right
                    // pitch = tilted up down
                    // yaw = camera tunred left/right

    public static Transform3d robotToCamera2 =
            new Transform3d(
                    new Translation3d(
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0)),
                    new Rotation3d(0, 0, 0));

    public static Transform3d robotToCamera3 =
            new Transform3d(
                    new Translation3d(
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0)),
                    new Rotation3d(0, 0, 0));

    public static Transform3d robotToCamera4 =
            new Transform3d(
                    new Translation3d(
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0),
                            Units.inchesToMeters(0)),
                    new Rotation3d(0, 0, 0));
    //Filtering
    public static double maxAmbiguity = 0.2; //Ambiguity: Confidence of the target detection, lower is better. 0 = perfect, 1 = worst
    public static double maxTagDistance = Units.inchesToMeters(0); //Max range to detect AprilTag
    public static double maxTargetArea = Units.inchesToMeters(0); //How large a tag appears to be detected

    //Standard Deviations
    public static double linearStandardDeviation = Units.inchesToMeters(0); //How much the position can vary
    public static double angularStandardDeviation = Units.degreesToRadians(0); //How much the angle can vary

    //how much to trust each camera in multiplier form closer to 0 = turst most farther from 0 = trust least
    public static double [] cameraStdDevFactors =
            new double[] {
                0, 
                0,
                0,
                0,
            };
}