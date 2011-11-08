package plugin;

import ij.gui.Roi;
import mpicbg.models.AbstractModel;

public class DescriptorParameters 
{
	/**
	 * How many iterations for a RANSAC
	 */
	public static int ransacIterations = 1000;
	
	/**
	 * minimal number of inliers to number of
	 * candidates in RANSAC
	 */
	public static float minInlierRatio = 0.05f;
	
	/**
	 * Max trust: reject candidates with a cost 
	 * larger than maxTrust * median cost 
	 */
	public static float maxTrust = 4f;
	
	/**
	 * How many times more inliers are required
	 * than the minimum number of correspondences
	 * required for the model.
	 * 
	 * E.g. AffineModel3d needs at least 4 corresponences,
	 * so we reject if the number of inliers is smaller
	 * than minInlierFactor*4 
	 */
	public static float minInlierFactor = 2f;

	public int dimensionality;
	public double sigma1, sigma2, threshold;
	public boolean lookForMaxima, lookForMinima;
	public AbstractModel<?> model;
	public int numNeighbors;
	public int redundancy;
	public double significance;
	public double ransacThreshold;
	public int channel1, channel2;
	
	// for stack-registration
	public int globalOpt; // 0=all-to-all; 1=all-to-all-withrange; 2=all-to-1; 3=Consecutive
	public int range;	
	
	public boolean reApply = false;
	public Roi roi1, roi2;
	
	public boolean setPointsRois = true;
	public boolean fuse = true;
}
