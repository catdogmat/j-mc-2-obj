package org.jmc;

import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;


/**
 * Holds the global options for the program.
 * 
 * Some options are only used in GUI mode or command line mode, but most apply to both.
 */
public class Options
{

	public enum UIMode
	{
		GUI,
		CONSOLE
	}

	public enum OffsetType
	{
		NONE,
		CENTER,
		CUSTOM
	}

	public enum OverwriteAction
	{
		ASK,
		ALWAYS,
		NEVER
	}

	/**
	 * A list of available locales in the program.
	 */	
	public static Locale availableLocales[] = { Locale.ENGLISH, Locale.GERMAN, Locale.CHINESE, new Locale("pl") };

	/**
	 * User interface mode.
	 */
	public static UIMode uiMode = UIMode.GUI; 
	

	/**
	 * Output directory.
	 */
	public static File outputDir = new File(".");

	/**
	 * Path to the Minecraft world save directory.
	 */
	public static File worldDir = null;

	/**
	 * Path to the texture pack to extract.
	 */
	public static File texturePack = null;

	/**
	 * Scaling to apply to textures.
	 */
	public static double textureScale = 1.0;

	/**
	 * Export alpha channel as separate file(s).
	 */
	public static boolean textureAlpha = false;
	
	/**
	 * Export a separate pass for blocks that should emit light. Useful for
	 * renders using GI.
	 */
	public static boolean textureLight;

	/**
	 * Merge textures into one file.
	 */
	public static boolean textureMerge = false;

	/**
	 * Export cloud texture to an OBJ file.
	 */
	public static boolean exportClouds = false;
	
	/**
	 * Export cloud texture to an OBJ file.
	 */
	public static String exportCloudsFile = "clouds.obj";
	
	/**
	 * Id of the world dimension to export.
	 */
	public static int dimension = 0;

	/**
	 * Lower bound of the volume to export.
	 */
	public static int minX=-32, minY=0, minZ=-32;

	/**
	 * Upper bound of the volume to export.
	 */
	public static int maxX=32, maxY=256, maxZ=32;

	/**
	 * How to scale the exported geometry.
	 */
	public static float scale = 1.0f;

	/**
	 * How to offset the coordinates of the exported geometry.
	 */
	public static OffsetType offsetType = OffsetType.NONE;

	/**
	 * Custom offset.
	 */
	public static int offsetX=0, offsetZ=0;

	/**
	 * If true, will export a separate object for each material.
	 */
	public static boolean objectPerMaterial = false;

	/**
	 * If true and objectPerMaterial is true, will ignore occlusion rules
	 * and always create faces for adjacent blocks that aren't the same.
	 */
	public static boolean objectPerMaterialOcclusionBarrier = true;

	/**
	 * If true, will export a separate object for each chunk.
	 */
	public static boolean objectPerChunk = false;

	/**
	 * If true, will add extra faces to backside of standalone faces.
	 */
	public static boolean doubleSidedFaces = false;

	/**
	 * If true, will export a separate object for each block.
	 */
	public static boolean objectPerBlock = false;
	
	/**
	 * If true, will convert ore blocks to stone.	
	 */
	public static boolean convertOres = false;
	
	/**
	 * If true, will export a separate object for each block.
	 */
	public static boolean singleMaterial = false;

	
	/**
	 * If true, will try harder to merge vertices that have the same coordinates.
	 */
	public static boolean removeDuplicates = false;
	
	/**
	 * If true, will try to merge planar faces and create optimized geometry.
	 */
	public static boolean optimiseGeometry = false;

	/**
	 * If true, sides and bottom of the model are rendered as well.
	 */
	public static boolean renderSides = false;	

	/**
	 * If true, entities are rendered in the model. 
	 */
	public static boolean renderEntities = false;

	/**
	 * If true, biomes are taken into account during export.
	 */
	public static boolean renderBiomes = true;

	/**
	 * If true, includes blocks with unknown block ids in the output. 
	 */
	public static boolean renderUnknown = false;	

	/**
	 * List of block ids to exclude.
	 */
	public static Set<String> excludeBlocks = new HashSet<String>();

	/**
	 * If true, UV file is used to convert UVs during export.
	 */
	public static boolean useUVFile = false;

	/**
	 * UV file from the setting above.
	 */
	public static File UVFile;

	/**
	 * Whether to export the world.
	 * Only used in console mode.
	 */
	public static boolean exportWorld = false;
	
	/**
	 * Whether to export the .obj file.
	 * Only used in console mode.
	 */
	public static boolean exportObj = true;
	
	/**
	 * If true, will export to the last location and name that was used.
	 */
	public static boolean useLastSaveLoc = true;

	/**
	 * Whether to export the .mtl file.
	 * Only used in console mode.
	 */
	public static boolean exportMtl = true;

	/**
	 * Whether to export the textures.
	 * Only used in console mode.
	 */
	public static boolean exportTex = false;
	
	/**
	 * Whether to export the base textures.
	 * Only used in console mode.
	 */
	public static boolean textureDiffuse = true;

	/**
	 * Whether to overwrite .OBJ files on export.
	 * Only used in GUI mode.
	 */
	public static OverwriteAction objOverwriteAction = OverwriteAction.ASK;

	/**
	 * Whether to overwrite .MTL files on export.
	 * Only used in GUI mode.
	 */
	public static OverwriteAction mtlOverwriteAction = OverwriteAction.ASK;

	/**
	 * Name of .OBJ file to export.
	 */
	public static String objFileName = "minecraft.obj";

	/**
	 * Name of .MTL file to export.
	 */
	public static String mtlFileName = "minecraft.mtl";
	
	/**
	 * How many threads to use when exporting.
	 */
	public static int exportThreads = 8;
	
	/**
	 * Whether to attempt exporting normal maps.
	 */
	public static boolean textureNormal = false;
	
	/**
	 * Whether to attempt exporting specular maps.
	 */
	public static boolean textureSpecular = false;
	
	
	
}
